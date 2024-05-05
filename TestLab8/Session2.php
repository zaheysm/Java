
<!DOCTYPE html>
<html lang="en">

<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>session2.php</title>
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


      
         //Displaying the variables and information here. 

         session_start(); //this will allow the session state to begin. It will allow me to get the information that was sent from session1.php. It serves as a connection port between session1.php and session2.php. 

         


         // if ((!isset($_SESSION["getSubmit"]) || $_SERVER["PHP_SELF"]))  {

            
        
            // if (!isset($_SESSION["getName"]) || (!isset($_SESSION["getID"])) || (!isset($_SESSION["getPhone"])) || (!isset($_SESSION["getEmail"])) || (!isset($_SESSION["getJob"])) || (!isset($_SESSION["getTask"]))    ) {

            //    header("Location: input.php"); 
            //    exit;

            //  if (!isset($name) || (!isset($id)) || (!isset($phone)) || (!isset($email)) || (!isset($jobTitle)) || (!isset($jobTask))    ) {

            // header("Location: input.php"); 
            // exit;

            

            //  }
               
               
   
            // }



         // }

         



         if (isset($_SESSION["getName"]) || isset($_SESSION["getID"]) || isset($_SESSION["getPhone"]) || isset($_SESSION["getEmail"]) || isset($_SESSION["getJob"]) ||  isset($_SESSION["getTask"])  )  { 
            
            $name = $_SESSION["getName"];
            $id = $_SESSION["getID"];
            $phone = $_SESSION["getPhone"];
            $email = $_SESSION["getEmail"];
            $jobTitle = $_SESSION["getJob"];
            $jobTask = $_SESSION["getTask"];

         }

        
        else {

            
            header("Location: Session1.php");
            exit;

            
         }


          


          
         
         // // This is for the EMPLOYEE INFO:
         // if (isset($_SESSION["getName"])) {

         //    $name = $_SESSION["getName"];
               
         // }

         // // else {

         // //    $name =  header("Location: input.php");    exit;
            
         // // }

         // if (isset($_SESSION["getID"])) {

         //    $id = $_SESSION["getID"];
         // }

         // // else {

         // //    $id=  header("Location: input.php");    exit;
         // // }


         // if (isset($_SESSION["getPhone"])) {

         //    $phone = $_SESSION["getPhone"];
         // }

         // // else {

         // //    $phone =  header("Location: input.php");    exit;
         // // }


         // if (isset($_SESSION["getEmail"])) {

         //    $email = $_SESSION["getEmail"];
         // }

         // // else {

         // //    $email =  header("Location: input.php");    exit;
         // // }



         // // This is for the Job title:
         // if (isset($_SESSION["getJob"])) {

         //    $jobTitle = $_SESSION["getJob"];
         // }

         // // else {

         // //    $jobTitle =  header("Location: input.php");    exit;
         // // }



         // // This is for the job task:
         // if (isset($_SESSION["getTask"])) {

         //    $jobTask = $_SESSION["getTask"];
         // }

         // // else {

         // //    $jobTask =  header("Location: input.php");    exit;
         // // }

          

      

       
        

         // if (!isset($name) || (!isset($id)) || (!isset($phone)) || (!isset($email)) || (!isset($jobTitle)) || (!isset($jobTask))    ) {

         //    header("Location: input.php"); 
         //    exit;

            

         // }
         
         
         
       

         
      


      ?>


      <!-- Printing the information to the screen -->
      <div>

         <p>Employee Name: <?php  echo (isset($name)) ? $name : ''; ?> </p>
         <p>Employee ID: <?php echo (isset($id)) ? $id : ''; ?> </p>
         <p>Phone Number: <?php echo (isset($phone)) ? $phone : ''; ?> </p>
         <p>Email Address: <?php echo (isset($email)) ? $email : ''; ?> </p>
         <p>Job Title: <?php echo (isset($jobTitle)) ? $jobTitle : ''; ?> </p>
         <p>Job Task: <?php echo (isset($jobTask)) ? $jobTask : ''; ?> </p>

      </div>
     




   </div>


   <!-- Footer -->
   <div id="footer">
      <?php include "footer.php"; ?>
   </div>



</body>

</html>