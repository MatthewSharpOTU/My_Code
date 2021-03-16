# Midterm Assignment

To run the program you first must load the project using Intellij. After the project has been loaded into Intellij attempt to compile the project in Intellij. If no error appears a popup should appear with the main menu. From there you can navigate to any of the sections: Animation ("Tan" Duck Walking/Swimming), 2D-Graphics (Initials spelt using basic shapes) or About (Gives information about the student and a brief explanation of the functionality of the program. Once you select a button to press, you can view the respective parts. On each section a back button will appear if you want to navigate back to the previous part. Once you are done close the window.

- If an error appeared in the output window:
1. Navigate to `Files -> Project Structures...` and see and make sure that the right sdk version 11+ and jdk version 11+ are installed an applied
2. Navigate to `Run -> Edit Configurations...` if you do not see an Application/Main then press the + symbol Application. Under build and run select the correct jdk file and version then press `Modify Options -> Add VM Options` and type this into the VM options input bar: --module-path "The\Path\To\JDK\lib;out\production" --add-modules=javafx.controls,javafx.fxml
