# StyleButton
Custom styles Button

This style button provided dash/dotted/line border of Button. 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

   Use the following dependencies


	     dependencies {
	        implementation 'com.github.sasisachin12:StyleButton:1.0.1'
	     }
       

just add app:dot_border="true"


           <android.sasi.develop.stylebutton.DotButton
            android:id="@+id/styleButton"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/button_text"
            app:dot_border="true"
           />
           
 **Default Button**          
  ![Screenshot 2019-09-01 at 10 16 47 PM](https://user-images.githubusercontent.com/53230870/64079545-4e612d00-cd06-11e9-8106-3faa08b2ca16.png)      
          
          

           
 You can customize button background color,dot/dash color,dot/dash width,dot/dash thickness, gap between dash/dot
 
            <android.sasi.develop.stylebutton.DotButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:dot_border="true"
            app:button_background="#E0F2F1"
            app:dot_color="#ff0000"
            app:dot_gap_width="3dp"
            app:dot_padding="5dp"
            app:dot_thickness="2dp"
            app:dot_width="6dp"
            />
            
            
  **Customised button**           
   ![Screenshot 2019-09-01 at 10 14 59 PM](https://user-images.githubusercontent.com/53230870/64079546-4ef9c380-cd06-11e9-94c7-0ef2805b08b6.png)
   
   **License**
    
    Copyright 2015 AndroidAdvance.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
            

       
       
