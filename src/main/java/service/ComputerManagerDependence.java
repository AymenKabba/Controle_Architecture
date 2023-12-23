package service;


import service.dtos.ComputerDto;

public interface ComputerManagerDependence {
    public ComputerDto getComputerByProce(String proce);
    public ComputerDto getComputerByPrice(float price);

    public ComputerDto saveComputer(ComputerDto computerDto) ;
    public ComputerDto deleteComputer(ComputerDto computerDto) ;
}
