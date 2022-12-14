# SmartSensor
## Overview
This project was split into two parts hardware and software. It was a group project of four members.
We split into 2 teams. Two of the team member worked on software side and other two members worked on hardware side of the project.
The concept of this proejct was to develope security device and an application provides emergency facility that could help anyone in threatening situation.
The app and device were both connected to firebase storge, so when the device send images to firebase storage, the app will notified the user and can able to view in milliseconds.
Software side of the project was to create an application 

## Features
For example if a user was walking down the street at late night and she has this device stapped on the back of backpack. 
If a stranger was following her for more than 3 mintues and in range of 5 meter of lidar sensor then the device will trigger the camera to capture a stable image. 
After the device has capture image trigger machine learning algorithm process to recognize if it was a person or object in the image with help of jetson nano library of ML.
At this time, the device will decide if the image should be discarded, if image does contain person then send to firebase storage,so the user can view the image 
or provide as evidence from the user's smartphone. 
We added some extra features in the app that could help the user in various situation such as phone location (last location of the user), emergency helpline contacts,
SOS ( there are two ways SOS can be used one way is a manually click the button and 
it will send a meassge to all of your emergency contact list saying that this person is in danger with last location corrdinates, and second way(only works when the user set the device mode to be armed) is automatically send when the app recieve a notification of a new image has been uploaded in firebase), 
we also implemented a fake siren that could help save someon's life.
