import googletrans
import speech_recognition
import gtts
import playsound
print("===============================================================================================================")
print("                                           NATURAL LANGUAGE PROCESSOR                                            ")
print("===============================================================================================================")
print("LANGUAGES AVAILABLE       ")
print("===============================================================================================================")
print(googletrans.LANGUAGES)
print("===============================================================================================================\n\n")
inlg=input("Source Language :")
oulg=input("Destination language:")

recognizer=speech_recognition.Recognizer()
with speech_recognition.Microphone()  as source:
    print("SPEAK NOW")
    voice=recognizer.listen(source)
    text=recognizer.recognize_google(voice,language=inlg) #I/P as english
    print(text)




    
translator=googletrans.Translator()
translation=translator.translate(text,dest=oulg)#O/P as french
print(translation.text)
con_audio=gtts.gTTS(translation.text,lang=oulg)
con_audio.save("hello.mp3")
playsound.playsound("hello.mp3")
