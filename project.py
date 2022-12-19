from datetime import datetime
from time import sleep
import os
import cv2

import pyrebase

config = {
	"apiKey": "AIzaSyAOoZ-O2rAuVsxnI_eCulV2CztL_7HbwZ8",
	"authDomain": "smartsensor-343416.firebaseapp.com",
	"databaseURL": "https://smartsensor-343416-default-rtdb.firebaseio.com",
	"projectId": "smartsensor-343416",
	"storageBucket": "smartsensor-343416.appspot.com",
	"serviceAccount": "Accountkey.json"

}

firebase = pyrebase.initialize_app(config)


storage = firebase.storage()

cap = cv2.VideoCapture(0, cv2.CAP_GSTREAMER)
print("pushed")
now = datetime.now()
dt = now.strftime("%m%d%Y%H:%M:%S")
name = dt+".jpg"
ret, frame = cap.read()
print(ret)
print(name+" saved")
cv2.imwrite(name,frame)
storage.child(name).put(name)
print("Image sent")
os.remove(name)
print("File Removed")
sleep(2)
cap.release()

