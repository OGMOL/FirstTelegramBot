package entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum Currency {
    USD(431), EUR(451), RUB(456), BUN(0), BYN(1);

    private final int id;

}
