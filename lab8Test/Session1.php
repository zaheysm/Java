

<!DOCTYPE html>
<html lang="en">

<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>session1.php</title>
   <!-- This is a link to stylesheet.css file. While using this <link> tag, it caused lots of css page loading issues. The css would not work properly while adding new changes. Then, I figured out another solution; to place my stylesheet.css in the php tag and inside the style tag.  -->
   <!-- <link rel="stylesheet"  href="stylesheet.css" type="text/css" > -->
   <style>
      <?php include "stylesheet.css" ?>

      /* <!-- This creates the vertical line, which is used for this php file. I can also put this in the stylesheet.css file.  -->  */
      .vertical {
         border: 1px solid black;
         height: 1000px;
         position: absolute;
         top: 10px;
         left: 50%;
      }
   </style>

   <!-- Put other CDN links here if necessary(bootstrap, JS, and etc) -->

</head>


<body>

   <!-- Header -->
   <div id="header">
      <?php include "header.php"; ?>
   </div>

   <!-- Menu -->
   <div id="menu">
      <?php include "menu.php"; ?>
   </div>

   <!-- Content -->
   <div id="content">




      <?php

         //Storing the variables here. 
      
         session_start(); //this will allow the session state to begin. It will allow me to redirect the user to session2.php to see the results.

         //ob_start(); 


         if (isset($_POST["submit"])) {

             

            $submit = $_POST["submit"]; 
            $_SESSION["getSubmit"] = $submit;

            // This is for the EMPLOYEE INFO: 
            if (isset($_POST["name"]) && strcmp($_POST["name"], "")) {
             $name = $_POST["name"];
             $_SESSION["getName"] = $name; //this will be used again in session2.php and so will all the others that use $_SESSION SG variable.
               

            }
            //  else {
            //    $name = " is not set in the form!";
            //    $_SESSION["getName"] = $name;
            // }

            if (isset($_POST["id"]) && strcmp($_POST["id"], "")) {
               $id = $_POST["id"];
               $_SESSION["getID"] = $id;
               
            } 
            // else {
            //    $id = " is not set in the form!";
            //    $_SESSION["getID"] = $id;
            // }

            if (isset($_POST["phone"]) && strcmp($_POST["phone"], "")) {
               $phone = $_POST["phone"];
               $_SESSION["getPhone"] = $phone;             

            } 
            // else {
            //    $phone = " is not set in the form!";
            //    $_SESSION["getPhone"] = $phone;
            // }

            if (isset($_POST["email"]) && strcmp($_POST["email"], "")) {
               $email = $_POST["email"];              
               $_SESSION["getEmail"] = $email;
               
            }
            //  else {
            //    $email = " is not set in the form!";
            //    $_SESSION["getEmail"] = $email;
            // }

            


            // This is for the Job Title:                                    
            if (isset($_POST["radiobutton"]) && ($_POST["radiobutton"] == "manager") ) {

               $jobTitle = "Manager";
               $_SESSION["getJob"] = $jobTitle;

            } else if (isset($_POST["radiobutton"]) && ($_POST["radiobutton"] == "teamlead")) {

               $jobTitle = "Team Lead";
               $_SESSION["getJob"] = $jobTitle;

            } else if (isset($_POST["radiobutton"])  && ($_POST["radiobutton"] == "itdeveloper")) {

               $jobTitle = "IT Developer";
               $_SESSION["getJob"] = $jobTitle;

            } else if (isset($_POST["radiobutton"])  && ($_POST["radiobutton"] == "itanalyst")) {

               $jobTitle = "IT Analyst";
               $_SESSION["getJob"] = $jobTitle;

            } 
            // else {
            //    $jobTitle = " is not set in the form!";
            //    $_SESSION["getJob"] = $jobTitle;
            // }

            


            // This is for the JOB TASKS: 
            if ($_POST["projects"] == "A") {

               $jobTask = "Project A";
               $_SESSION["getTask"] = $jobTask;

            } 
            else if ($_POST["projects"] == "B") {

               $jobTask = "Project B";
               $_SESSION["getTask"] = $jobTask;

            } 
            else if ($_POST["projects"] == "C") {

               $jobTask = "Project C";
               $_SESSION["getTask"] = $jobTask;

            } 
            else if ($_POST["projects"] == "D") {

               $jobTask = "Project D";
               $_SESSION["getTask"] = $jobTask;

            } 
            // else {

            //    $jobTask = " is not set in the form!";  //$jobTask = header("Location: input.php");    exit;
            //    $_SESSION["getTask"] = $jobTask;
               
            // }


            //This will redirect the user to the session2.php, where the information will be displayed. It should be the last thing in the php code, where session_start() or session state is used. 
            header("Location: Session2.php");
            exit;
             
           
            
   

            
         }

        

         

         


      ?>
         


      <form method="post" action="session1.php">

         <!-- Fix this html code afterwards -->
         <!-- <div style="text-align: left; ">
            <h1> LS </h1>
         </div> -->
         <pre>
                  <!-- These are Text Boxes that contain employee information  -->
                  Employee Name: &nbsp;&emsp;<input type="text" name="name"> 
                  Employee ID:   &nbsp;&emsp;<input type="text" name="id">   
                  Phone Number:  &nbsp;&nbsp;<input type="text" name="phone">  
                  Email Address: &nbsp;&nbsp;<input type="text" name="email">   
               <!-- Radio Button List, with the values Manager, Team Lead, IT Developer, and IT Analyst -->
               &emsp;&emsp;<input type="radio" name="radiobutton" value="manager">Manager
               &emsp;&emsp;<input type="radio" name="radiobutton" value="teamlead">Team Lead
               &emsp;&emsp;<input type="radio" name="radiobutton" value="itdeveloper">IT Developer
               &emsp;&emsp;<input type="radio" name="radiobutton" value="itanalyst">IT Analyst
               <!-- multiple select box that lists 4 IT projects: Project A, Project B, Project C, Project D -->
               <label for="projects"> 
              &emsp;&emsp; IT Projects:<select name="projects">
                  <option value=""></option> 
                  <option value="A">Project A</option>
                  <option value="B">Project B</option>
                  <option value="C">Project C</option>
                  <option value="D">Project D</option>
               </select>


               &emsp;&emsp;<input type="submit" name="submit" value="Submit Information">
               


         </pre>



      </form>

      
     


   </div>


   <!-- Footer -->
   <div id="footer">
      <?php include "footer.php"; ?>
   </div>



</body>

</html>



<?php
 

?>