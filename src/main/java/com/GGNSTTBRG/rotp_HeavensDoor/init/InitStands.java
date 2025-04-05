package com.GGNSTTBRG.rotp_heavensdoor.init;
import com.GGNSTTBRG.rotp_HeavensDoor.RotpHeavensDoorAddon;
import com.github.standobyte.jojo.util.mod.StoryPart;
import com.GGNSTTBRG.rotp_heavensdoor.entity.stand.stands.HeavensDoorEntity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityAction.Phase;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import static com.github.standobyte.jojo.init.ModEntityTypes.ENTITIES;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpHeavensDoorAddon.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpHeavensDoorAddon.MOD_ID);
    
 // ======================================== HeavensDoor ========================================
    
    public static final RegistryObject<StandEntityAction> HEAVENS_DOOR_PUNCH = ACTIONS.register("heavensdoor_punch", 
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.HEAVENS_DOOR_PUNCH_LIGHT)
                    .standSound(Phase.WINDUP, InitSounds.HEAVENS_DOOR_ORA)));
    
    public static final RegistryObject<StandEntityAction> HEAVENS_DOOR_BARRAGE = ACTIONS.register("heavensdoor_barrage", 
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.HEAVENS_DOOR_BARRAGE)
                    .standSound(InitSounds.HEAVENS_DOOR_ORA_ORA_ORA)));
    
    public static final RegistryObject<StandEntityHeavyAttack> HEAVENS_DOOR_COMBO_PUNCH = ACTIONS.register("heavensdoor_combo_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.HEAVENS_DOOR_PUNCH_HEAVY)
                    .standSound(Phase.WINDUP, InitSounds.HEAVENS_DOOR_ORA_LONG)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityHeavyAttack> HEAVENS_DOOR_HEAVY_PUNCH = ACTIONS.register("heavensdoor_heavy_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.HEAVENS_DOOR_PUNCH_HEAVY)
                    .standSound(Phase.WINDUP, InitSounds.HEAVENS_DOOR_ORA_LONG)
                    .partsRequired(StandPart.ARMS)
                    .setFinisherVariation(HEAVENS_DOOR_COMBO_PUNCH)
                    .shiftVariationOf(HEAVENS_DOOR_PUNCH).shiftVariationOf(HEAVENS_DOOR_BARRAGE)));
    
    public static final RegistryObject<StandEntityAction> HEAVENS_DOOR_BLOCK = ACTIONS.register("heavensdoor_block", 
            () -> new StandEntityBlock());


    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<HeavensDoorEntity>> HEAVENS_DOOR_STAND =
            new EntityStandRegistryObject<>("heavensdoor",
                    STANDS,
                    () -> new EntityStandType.Builder<>()
                            .color(0xFFFFFF)
                            .storyPartName(StoryPart.OTHER.getName())
                            .leftClickHotbar(
                                    HEAVENS_DOOR_PUNCH.get(),
                                    HEAVENS_DOOR_BARRAGE.get()
                            )
                            .rightClickHotbar(
                                    HEAVENS_DOOR_BLOCK.get()
                            )
                            .defaultStats(StandStats.class, new StandStats.Builder()
                                    .power(16.0)
                                    .speed(16.0)
                                    .range(50.0, 100.0)
                                    .durability(16.0)
                                    .precision(16.0)
                                    .randomWeight(1)
                            )
                            .addSummonShout(InitSounds.USER_HEAVENS_DOOR)
                            .addOst(InitSounds.HEAVENS_DOOR_OST)
                            .build(),

                    ENTITIES,
                    () -> new StandEntityType<HeavensDoorEntity>(HeavensDoorEntity::new, 0.65F, 1.95F)
                            .summonSound(InitSounds.HEAVENS_DOOR_SUMMON)
                            .unsummonSound(InitSounds.HEAVENS_DOOR_UNSUMMON))
                    .withDefaultStandAttributes();
}
