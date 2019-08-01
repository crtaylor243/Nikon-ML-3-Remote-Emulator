# Nikon-ML-3-Remote-Emulator
An android application that emulates the function of the ML-3 Infrared Remote Shutter accessory.

The Nikon ML-3 Remote sends a coded IR signal to the receiver on-camera to trigger the shutter release. For this project, the
ML-3 control signal was recorded, then converted into a WAV audio file. When the audio file is played on an Android headset with the 
appropriate custom hardware device plugged into the audio jack, the audio file is translated back to the IR spectrum which
is functionally equivalent to the original ML-3 device.

I do not have a schematic available for the custom board, but the circuit is very straightforward (IR LED with some rectification
and amplification). 

I did not extensively test the remote, but it worked reliably at typical portrait distances inside an apartment building.
