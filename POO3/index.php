<?php
$a = 2;
$b = 5;
$c = 7;
function legal($y,$z){
  $resultado = ($y*3) +$z;
  return $resultado;
}
echo legal(($a*$b)- $c,$a);