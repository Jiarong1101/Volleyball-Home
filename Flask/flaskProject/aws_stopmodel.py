# stop model

import boto3


def stop_model(model_arn):
    client = boto3.client('rekognition',
                      aws_access_key_id='AKIAUKK6X5YO3YUS4UQ3',
                      aws_secret_access_key='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', region_name='us-east-1')

    print('Stopping model:' + model_arn)

    # Stop the model
    try:
        response = client.stop_project_version(ProjectVersionArn=model_arn)
        status = response['Status']
        print('Status: ' + status)
    except Exception as e:
        print(e)

    print('Done...')


def op():
    model_arn = 'arn:aws:rekognition:us-east-1:297088314909:project/volleyball928/version/volleyball928.2022-09-28T22.07.52/1664374074753'
    stop_model(model_arn)


if __name__ == "__main__":
    op()
