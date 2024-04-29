References
channel name: Anushka Madusanka
https://youtu.be/BCSlZIUj18Y?si=vKc6_d1PBdH922Se
channel name: Any Technology
https://youtu.be/AdlxIdYus14?si=NhUuhJhG1VGBBj08
channel name: AndroidMinutes
https://youtu.be/K5bFv_WDjVY?si=tkWIuFuj0M4nnWHK
description on code
So, in this bit of Kotlin code we're poking at for an Android app, we've got a chunk that's all about finding a 'Button' named button. Once it finds it, it slaps a click listener on it. When someone taps this button, it whisks them away to another page called ActivityPage.

Also, the code's set up to handle three more buttons: btnFeed, unclean, and btnplay. Each one has its feeding, cleaning, and playing. Tap any of these, and you're off to a related activity like FeedActivity, CleanActivity, or PlayActivity based on what the button does.

There's another part where a backbutton gets its listener for when you tap it, it sends you over to this loadingscreen activity. Hitting "back" means, "Let's load something new."

On a slightly different note, there's a spot in the code where it uses a Handler to put off running some code for 5 seconds. After waiting, it jumps you to an activity called Activitypage.

Here's how that goes down:

1. First up, whip up a new Handler with val handler = Handler(Looper.getMainLooper()) to grab the main thread's looper.
   
2. Then, you tell this Handler to wait a bit with postDelayed({ . }, 5000), scheduling some task (stuffed in a lambda expression) to run after chilling for 5 seconds.

   Youtube video
   
