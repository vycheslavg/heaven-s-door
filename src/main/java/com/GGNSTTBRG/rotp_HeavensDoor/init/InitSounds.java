package com.GGNSTTBRG.rotp_HeavensDoor.init;

import java.util.function.Supplier;

import com.GGNSTTBRG.rotp_HeavensDoor.RotpHeavensDoorAddon;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpHeavensDoorAddon.MOD_ID);
    
    public static final RegistryObject<SoundEvent> USER_HEAVENS_DOOR = SOUNDS.register("user_heavensdoor", 
            () -> new SoundEvent(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "user_heavensdoor")));

    public static final Supplier<SoundEvent> HEAVENS_DOOR_SUMMON = ModSounds.STAND_SUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> HEAVENS_DOOR_UNSUMMON = ModSounds.STAND_UNSUMMON_DEFAULT;
    
    public static final RegistryObject<SoundEvent> HEAVENS_DOOR_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> HEAVENS_DOOR_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> HEAVENS_DOOR_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final RegistryObject<SoundEvent> HEAVENS_DOOR_ORA = SOUNDS.register("heavensdoor_ora", 
            () -> new SoundEvent(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "heavensdoor_ora")));
    
    public static final RegistryObject<SoundEvent> HEAVENS_DOOR_ORA_LONG = SOUNDS.register("heavensdoor_ora_long", 
            () -> new SoundEvent(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "heavensdoor_ora_long")));
    
    public static final RegistryObject<SoundEvent> HEAVENS_DOOR_ORA_ORA_ORA = SOUNDS.register("heavensdoor_ora_ora_ora", 
            () -> new SoundEvent(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "heavensdoor_ora_ora_ora")));
    
    static final OstSoundList HEAVENS_DOOR_OST = new OstSoundList(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "heavensdoor_ost"), SOUNDS);

}
