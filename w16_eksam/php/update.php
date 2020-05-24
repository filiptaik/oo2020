<?php
require 'config.php';

$conn = new mysqli($GLOBALS["serverHost"], $GLOBALS["serverUsername"], $GLOBALS["serverPassword"], $GLOBALS["database"]);
//$conn  = mysqli_connect($GLOBALS["serverHost"], $GLOBALS["serverUsername"], $GLOBALS["serverPassword"], $GLOBALS["database"]);

if(isset($_POST["id"])){
    
    $value = mysqli_real_escape_string($conn, $_POST["value"]);
    $query = "UPDATE Students SET ".$_POST["columnname"]."='".$value."' WHERE id = '".$_POST["id"]."'";
    $result = mysqli_query($conn, $query);
    if (!$result) {
        printf("Error: %s\n", mysqli_error($conn));
        exit();
    }

    if(mysqli_query($conn, $query)){
        echo 'Andmed uuendatud!';
    }
} else {
    echo 'Viga andmete uuendamisel';
}
?>