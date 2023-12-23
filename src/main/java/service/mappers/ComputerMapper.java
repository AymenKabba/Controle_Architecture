package service.mappers;


import dao.entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import service.dtos.ComputerDto;

@Component
public class ComputerMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public ComputerDto fromComputerToComputerDto(Computer computer) {
        return this.modelMapper.map(computer, ComputerDto.class);
    }

    public Computer fromComputerDtoToComputer(ComputerDto computerDto) {
        return this.modelMapper.map(computerDto, Computer.class);
    }
}
