package com.transoft.mfsb.service.implement;

import com.transoft.mfsb.domain.entity.Country;
import com.transoft.mfsb.repository.CountryReposit;
import com.transoft.mfsb.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryReposit countryReposit;

    public CountryServiceImpl(CountryReposit countryReposit) {
        this.countryReposit = countryReposit;
    }

    @Override
    public List<Country> listCountries() {
        return (List<Country>)countryReposit.findAll();
    }

    @Override
    public Optional<Country> getCountryById(Integer id) {
        return countryReposit.findById(id);
    }
}
