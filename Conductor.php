<?php
class Conductor
{
    private $vehicle;
    public function __construct($vehicle){
        $this->setVehicle($vehicle);
        echo PHP_EOL."Oh yeah!";
    }

    public function setVehicle($vehicle){
        $this->vehicle = $vehicle;
    }

    public function accelera(){
        if ($this->vehicle->getVelocitatActual() == 0){
            $this->vehicle->moute(10);
        }else{
            $this->vehicle->moute($this->vehicle->getVelocitatActual() * 1.25);
        }
    }

    public function frena(){
        if ($this->vehicle->getVelocitatActual() == 0){
            echo PHP_EOL."-_-";
        }else{
            $this->vehicle->aturat();
        }
    }
}
?>