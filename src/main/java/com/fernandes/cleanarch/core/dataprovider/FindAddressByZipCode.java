package com.fernandes.cleanarch.core.dataprovider;

import com.fernandes.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
