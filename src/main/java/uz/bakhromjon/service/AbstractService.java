package uz.bakhromjon.service;


import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractService<R> {
    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }
}
