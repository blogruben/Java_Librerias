package com.ruben.mapper.BeforeAfterMapping;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.mapstruct.ReportingPolicy;

    //quitamos el warning de que se mapean atributos automaticamente porque se llaman igual
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public abstract class MapearBeforeAfterMapping {
        
        public static MapearBeforeAfterMapping INSTANCE = Mappers.getMapper(MapearBeforeAfterMapping.class);

        @BeforeMapping
        protected void enrichDTOWithFuelType(Coche coche, @MappingTarget CocheEntity cocheDTO) {
            if (coche instanceof CocheGasolina) {
                cocheDTO.setTipoCombustible(TipoCombustible.GASOLINA);
            }
            if (coche instanceof CocheDiesel) { 
                cocheDTO.setTipoCombustible(TipoCombustible.DIESEL);
            }
        }
    
        @AfterMapping
        protected void convertNameToUpperCase(@MappingTarget CocheEntity cocheDTO) {
            cocheDTO.setMarca(cocheDTO.getMarca().toUpperCase());
        }
    
        public abstract CocheEntity cocheEntityToCoche(Coche coche);
    }

