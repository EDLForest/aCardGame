package com.haosen.edlforest.base;

import lombok.Getter;
import lombok.Setter;

public abstract class Card {
    @Getter
    @Setter
    private String name;

    @Override
    public String toString() {
        return this.getName();
    }
}
