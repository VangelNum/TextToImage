# TextToImage
Text to image using mediapipe image generation

To run the application, you need to connect your phone and add the generated models.
```
adb shell rm -r /data/local/tmp/image_generator/ # Remove any previously loaded weights
adb shell mkdir -p /data/local/tmp/image_generator/
adb push /your/path/to/converted_models/. /data/local/tmp/image_generator/bins
```

Please replace /your/path/to/converted_models/ with your actual file path.

Requirements for running on the phone:
6 GB of RAM

For more information, you can visit https://developers.google.com/mediapipe/solutions/vision/image_generator/android
