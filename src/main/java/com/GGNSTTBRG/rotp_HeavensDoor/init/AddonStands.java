package com.GGNSTTBRG.rotp_HeavensDoor.init;

import com.GGNSTTBRG.rotp_HeavensDoor.entity.stand.stands.HeavensDoorEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<StandStats>, StandEntityType<HeavensDoorEntity>> 
    HEAVENS_DOOR = new EntityStandSupplier<>(InitStands.STAND_HEAVENS_DOOR);
}
