package service;

import dao.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.dtos.ComputerDto;
import service.mappers.ComputerMapper;


@Component
public class ComputerManager implements ComputerManagerDependence {


    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto getComputerByProce(String proce) {
        return computerMapper.fromComputerToComputerDto(computerRepository.findByProce(proce).get());
    }

    @Override
    public ComputerDto getComputerByPrice(float price) {
        return computerMapper.fromComputerToComputerDto(computerRepository.findByPrice(price).get());
    }

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        return computerMapper.fromComputerToComputerDto(computerRepository.save(computerMapper.fromComputerDtoToComputer(computerDto)));

    }

    @Override
    public ComputerDto deleteComputer(ComputerDto computerDto) {
        return computerMapper.fromComputerToComputerDto(computerRepository.delete(computerMapper.fromComputerDtoToComputer(computerDto)));

    }


}
