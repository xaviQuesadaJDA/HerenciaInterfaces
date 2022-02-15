<?php
require_once ("Cotxe.php");
require_once ("Moto.php");
class VehicleFactory{
    public static function getVehicle($conductor){
        switch(strtolower($conductor["vehicle"])){
            case "cotxe":
                return new Cotxe($conductor["marca"], $conductor["model"]);
                break;
            case "moto":
                return new Moto($conductor["marca"], $conductor["model"]);
                break;
            default:
                return null;
                break;
        }
    }
}
?>