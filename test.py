from datetime import datetime
from time import sleep
import os

import firebase_admin
from firebase_admin import auth 
from firebase_admin import credentials

import pyrebase

config = {
	"apiKey": "AIzaSyBX66K5n0r9cMmqcD7DoivC-aH11BbTeys",
	"authDomain": "smartsensor-343416.firebaseapp.com",
	"databaseURL": "https://smartsensor-343416-default-rtdb.firebaseio.com",
	"projectId": "smartsensor-343416",
	"storageBucket": "smartsensor-343416.appspot.com",
	"serviceAccount": "Accountkey.json"

}


cred = credentials.Certificate('C:/Users/patel/Desktop/Accountkey.json') 
firebase = firebase_admin.initialize_app(cred)
firebase = pyrebase.initialize_app(config)

token = firebase.auth()
print(token)


for user in auth.list_users().iterate_all():
	print('User: ' + user.email)
	user = str(auth.get_user(user.uid))
	ar = token.get_account_info(user)
	print(ar)
	print('User: ' + user.uid)
	print(auth.get_user(user.uid))
	print(auth.ImportUserRecord(user.email))
	#print(token.get_account_info(auth.get_user_by_email(user.email)['idToken']))

storage = firebase.storage()