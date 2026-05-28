# Java Snap

## Snap Card Game
A two player Java game that takes place inside the terminal. Players draw cards from 
a single deck, and upon a consecutive draw of two cards of the same symbol - SNAP!
- - -
## Prerequisites
- Java Development Kit (JDK) 21 
- - Run java -version to check for correct installation
- Maven
- Git (if you want to clone) or you are able to download a ZIP folder
- - -
## How to Download
- Clone via Git: git clone https://github.com/Hba25/java_Snap.git
- OR you can navigate to https://github.com/Hba25/java_Snap , Click the green <> Code 
button, and click Download ZIP. Unzip on your device. 
- - -
## Build and Run
### Run from terminal
1. Open terminal to where the pom.xml file is
2. Run `mvn clean compile`
3. Run java -cp target/classes org.example.Main
### Run from IDE
1. Open project folder
2. Load the Maven project
3. Right-click the Main class, and click "Run Main.main()". Or press the green arrow 
in the top bar next to the bug icon. 
- - - 
## How to Play
1. Press Enter to draw a card on your turn. The drawn card will be logged to the terminal
2. When there are two identical ranks in a row, the current player has 2 seconds
to type snap. If you type it in time, you gain a point. Else, the other player gets the point. 
3. The game ends when the deck is empty and the player with more points wins!

