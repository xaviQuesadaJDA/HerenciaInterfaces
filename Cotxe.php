<?php
require_once ("iVehicle.php");
class Cotxe implements iVehicle
{
    private $velocitat=0;
    private $marca;
    private $model;

    function __construct($marca, $model){
        $this->marca = $marca;
        $this->model = $model;
    }

    public function getVelocitatActual(){
        return $this->velocitat;
    }

    public function moute($velocitat){
        $this->velocitat = $velocitat;
        echo PHP_EOL."M'estic movent a ".$this->velocitat." Km/h.";
    }
    
    public function aturat(){
        $this->velocitat = 0;
        echo PHP_EOL."M'estic aturant. Fa olor a roda cremada.";
    }
}
?>