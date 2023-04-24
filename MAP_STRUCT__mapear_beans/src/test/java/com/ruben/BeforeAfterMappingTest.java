package com.ruben;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ruben.mapper.BeforeAfterMapping.CocheDiesel;
import com.ruben.mapper.BeforeAfterMapping.CocheEntity;
import com.ruben.mapper.BeforeAfterMapping.MapearBeforeAfterMapping;
import com.ruben.mapper.BeforeAfterMapping.TipoCombustible;

public class BeforeAfterMappingTest {

    @Test
    public void givenBeforeAfterMapping_whenMaps_thenCorrect(){
        CocheDiesel cocheDiesel  = new CocheDiesel();
        cocheDiesel.setMarca("Mercedes");
        CocheEntity cocheEntity = MapearBeforeAfterMapping.INSTANCE.cocheEntityToCoche(cocheDiesel);
        assertEquals(cocheDiesel.getId(),cocheEntity.getId()); 
        assertEquals(cocheDiesel.getMarca().toUpperCase(),cocheEntity.getMarca()); 
        assertEquals(TipoCombustible.DIESEL.name(),cocheEntity.getTipoCombustible().name()); 
    }

}
