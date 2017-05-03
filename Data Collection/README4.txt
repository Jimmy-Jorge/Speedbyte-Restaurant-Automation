Graphical User Interface testing, according to the UI specified in the earlier reports and found within the application, was stress tested using Monkey Testing. Monkey testing is an automated testing tool within Android that allows you to rigorously test the user interface. Below you will find a sample usage of Monkey testing and how to get started:

1. Set up your Android Studio according to the README.md found at https://github.com/rpartha/speedbyte-restaurant-automation
2. Locate and move to the .../Android/sdk/platform-tools and execute the following command: 
	adb shell -p <package> <options> 
	
	<options>* : -s <seed> --pct-syskeys <percent> <verbosity level> <event count> > <file name>.txt

	-p <package> are the package(s) within your application that the system will run the activies from. 
	-s <seed> is a number you specify so that when you run these tests again, you can run with same settings. 
	--pct-syskeys <percent> specifies the percentage of clicks of system keys such as volume, brightness, etc.
	<verbosity level> specifies how detailed you want the output to be from -v (least) to -v -v -v (most).
	<event count> states over how many times you would like the application to tested (e.g. how many clicks)
	<file name>.txt is the file that will store the output of the tests. You can give whatever name.

	*<options> are not limited to the ones specified here. More options can be found at https://developer.android.com/studio/test/monkey.html


   UI was tested using the following command: adb shell -p com.example.vam1994.speedbyte --pct-syskeys 0 -s 9000 -v -v -v 100000 > test_log6.txt
	
3. View the output in the file test_log6.txt. Analysis below.

The command above will test the UI randomly 100,000 times. The output was generated in a test_log10.txt, which can be found under the Demo Materials > Data Collection > test_log10.txt If you take a look at the file, one can see a list of the actions that were sent to the application and from which activity it was sent from. I made sure to specifiy that the number of systems clicks were 0 so that the automated testing would not include system keys as specified in the <syskeys> description. The clicks included major navigation such as up, down, right, and left swipes, as well as clicks on the buttons and spinners (drop down) lists. What's good is that there are under succesful runs of the app, the launched processes will not stop unless a crash occurs. Over these pseudo-random 100000 tests, the conclusion can be made that our application handled all the UI functionality well and that no real issues were found. 
	
