package creacionales.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Engine {

    private Integer engineCapacity; // establecer capacidad del motor

    public Engine(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}