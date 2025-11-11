# analyze image
import io
import boto3

from PIL import Image, ImageDraw, ExifTags, ImageColor, ImageFont

def show_custom_labels(model, min_confidence):
    client = boto3.client('rekognition',
                      aws_access_key_id='AKIAUKK6X5YO3YUS4UQ3',
                      aws_secret_access_key='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', region_name='us-east-1')
    image_path = "static/images/PoseDetection.jpg"
    image = Image.open(image_path)
    stream = io.BytesIO()
    image.save(stream, format="JPEG")
    image_binary = stream.getvalue()
    # Call DetectCustomLabels
    response = client.detect_custom_labels(Image={'Bytes': image_binary},
                                           MinConfidence=min_confidence,
                                           ProjectVersionArn=model)
    return response['CustomLabels']

def main():
    model = 'arn:aws:rekognition:us-east-1:297088314909:project/volleyball928/version/volleyball928.2022-09-28T22.07.52/1664374074753'
    min_confidence = 75
    label_count = show_custom_labels(model, min_confidence)
    #print("Custom labels detected: " + str(label_count))
    print(label_count)
    return label_count

if __name__ == "__main__":
    main()
