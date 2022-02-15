<?php
require_once ("Cotxe.php");
require_once ("Moto.php");
require_once ("Conductor.php");

$joan = new Conductor(new Cotxe("Ford", "Mustang"));

$joan->accelera();
$joan->accelera();
$joan->accelera();
$joan->frena();
$joan->frena();

$joan->setVehicle(new Moto("BMW","R850R"));

$joan->accelera();
$joan->accelera();
$joan->accelera();
$joan->frena();
$joan->frena();

?>