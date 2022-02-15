<?php
require_once ("Conductor.php");
require_once("VehicleFactory.php");

$config = yaml_parse_file("config.yml");
foreach ($config as $conductor_config){
    echo("nom: ".$conductor_config["nom"].PHP_EOL);
    echo("vehicle: ".$conductor_config["vehicle"].PHP_EOL);
    echo("marca: ".$conductor_config["marca"].PHP_EOL);
    echo("model: ".$conductor_config["model"].PHP_EOL);

    $conductor = new Conductor(VehicleFactory::getVehicle($conductor_config));
    
    $conductor->frena();
    $conductor->accelera();
    $conductor->accelera();
    $conductor->accelera();
    $conductor->frena();
    $conductor->frena();
}
?>