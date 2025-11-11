import base64

import flask
import werkzeug.utils
import aws_analyzeimage
import aws_stopmodel
from flask import Flask, render_template, request, jsonify
# import request
from flask import request
from datetime import timedelta, time
from werkzeug.utils import secure_filename

import boto3
import os
import io
from PIL import Image, ImageDraw, ExifTags, ImageColor, ImageFont


app = Flask(__name__)
index = 0


@app.route('/')
def showHomePage():  # put application's code here
    return 'This is volleybalhome'


ALLOWED_EXTENSIONS = set(['png', 'jpg', 'JPG', 'PNG', 'bmp'])
def allowed_file(filename):
    return '.' in filename and filename.rsplit('.', 1)[1] in ALLOWED_EXTENSIONS

# 设置静态文件缓存过期时间
app.send_file_max_age_default = timedelta(seconds=1)


@app.route("/debug", methods=["POST"])
def debug():
    text = request.form["sample"]
    print(text)
    return "received"

@app.route('/API', methods=["GET", 'POST'] ) #路由的配置
def API():
    image = request.form.get('image')
    image = image.replace(' ', '+')
    if( image != None ):
        imagefile = "./static/images/PoseDetection.jpg"
        imagedata = base64.b64decode( image )
        file = open(imagefile,'wb')
        file.write(imagedata)
        file.close()
        aws_analyzeimage.main()
        return "imagefile"
    else:
        return "-2"


@app.route('/result')
def result():
    pose = aws_analyzeimage.main()
    print(pose)
    return pose['Name']
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
