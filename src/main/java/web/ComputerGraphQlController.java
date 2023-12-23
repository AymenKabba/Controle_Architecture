package web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import service.ComputerManagerDependence;
import service.dtos.ComputerDto;

@Controller
public class ComputerGraphQlController {

    @Autowired
    private ComputerManagerDependence computerManagerDependence;
    // getComputerById(id: Float) : ComputerDto

    @QueryMapping
    public ComputerDto getComputerByProce(@Argument String proce) {
        return computerManagerDependence.getComputerByProce(proce);
    }

    @QueryMapping
    public ComputerDto getComputerByPrice(@Argument Float price) {
        return computerManagerDependence.getComputerByPrice(price);
    }
    @MutationMapping
    public ComputerDto saveComputer(ComputerDto computerDto) {
        return computerManagerDependence.saveComputer(computerDto);
    }

    @MutationMapping
    public ComputerDto deleteComputer(ComputerDto computerDto) {
        return computerManagerDependence.deleteComputer(computerDto);
    }
}

