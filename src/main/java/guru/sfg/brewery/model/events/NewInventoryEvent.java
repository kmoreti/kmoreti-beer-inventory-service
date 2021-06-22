package guru.sfg.brewery.model.events;

import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-07-21.
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    private static final long serialVersionUID =  -3915175777227421743L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
