package one.digitalinnovation.beerstock.mapper;

import javax.annotation.Generated;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-07T12:27:26-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 11.0.11 (Azul Systems, Inc.)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTO beerDTO = new BeerDTO();

        return beerDTO;
    }
}
