<?php
    require 'config.php';

    $rawData = file_get_contents("php://input");
    $myData = urldecode($rawData);
    $object = json_decode($myData, true);

    storeStudentInfo($object);

    function storeStudentInfo($allData){
        print_r(array_chunk($allData, 2));
    
        $results = array();
        $yolo = array_keys($allData[0]);
    
        print_r($yolo);
        
        foreach ($allData[0] as $key => $value) {
            $results[] = $key; 
        }
    
        print_r($results[0]);
        $conn = new mysqli($GLOBALS["serverHost"], $GLOBALS["serverUsername"], $GLOBALS["serverPassword"], $GLOBALS["database"]);
    
        $query = "SELECT ID FROM Students";
        $result = mysqli_query($conn, $query);
        
        if(empty($result)) {
            $createDb = "CREATE TABLE Students (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(50) NOT NULL,
                field VARCHAR(50),
                studentid VARCHAR(50) NOT NULL,
                email VARCHAR(50)
            )  ENGINE=INNODB;";
            $result = mysqli_query($conn, $createDb);
        }
    
    
        $x = 0;
        while($x <= count($allData) + 1) {

            $stmt = $conn -> prepare ("INSERT INTO Students (name, field, studentid, email) VALUES(?,?,?,?)");
            echo $conn -> error;
            //andmetüübid: s - string, i - integer, d - decimal
            $stmt -> bind_param("ssss", $allData[$x]["Name"], $allData[$x]["Field"], $allData[$x]["StudentID"], $allData[$x]["Email"]);
            $stmt -> execute();
            $x++;
        }
        if($stmt -> execute()){
            echo 'Andmed sisestatud!';
        }
        
        $stmt -> close();
        $conn -> close();
        
            
    
    }
    
?>