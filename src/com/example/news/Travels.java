package com.example.news;

import java.util.ArrayList;
import java.util.List;

/*
Copyright 2012 Aphid Mobile

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */
public class Travels {

  public static final List<Data> IMG_DESCRIPTIONS = new ArrayList<Data>();

  static {
	Travels.IMG_DESCRIPTIONS.add(new Travels.Data("Facebook", "facebook.png",
                "Facebook",
                "China", "Samye",
                "https://www.facebook.com/"));
	Travels.IMG_DESCRIPTIONS.add(new Travels.Data("Haivl", "facebook.png",
            "Haivl",
            "China", "Samye",
            "http://www.haivl.com/"));
    Travels.IMG_DESCRIPTIONS.add(new Travels.Data("24h", "24h.png",
                                                  "24h, Báo điện tử nhanh nhất Việt Nam",
                                                  "China", "Lhasa",
                                                  "http://24h.com.vn/"));
    Travels.IMG_DESCRIPTIONS.add(new Travels.Data("VnExpress", "vnexpress2008layoutbx3.png",
                                                  "VnEpress, Báo điện tử nhiêù người xem nhất Việt Nam",
                                                  "China", "Lhasa",
                                                  "http://vnexpress.net/"));
    Travels.IMG_DESCRIPTIONS.add(new Travels.Data("Dantri", "sera_monastery.jpg",
                                                  "Dan Tri, lá cải nhất Việt Nam",
                                                  "China", "Lhasa",
                                                  "http://dantri.com.vn/"));

    Travels.IMG_DESCRIPTIONS.add(
        new Travels.Data("Kenh 14", "tashilunpo_monastery.jpg",
                         "Kenh 14, chuối nhất Việt Nam",
                         "China", "Shigatse",
                         "http://kenh14.vn/"));
    Travels.IMG_DESCRIPTIONS.add(new Travels.Data("TuoiTre", "zhangmu_port.jpg",
                                                  "Báo Tuoi Tre",
                                                  "China", "Zhangmu",
                                                  "http://tuoitre.vn/"));

  }

  public static final class Data {

    public final String title;
    public final String imageFilename;
    public final String description;
    public final String country;
    public final String city;
    public final String link;

    private Data(String title, String imageFilename, String description, String country,
                 String city, String link) {
      this.title = title;
      this.imageFilename = imageFilename;
      this.description = description;
      this.country = country;
      this.city = city;
      this.link = link;
    }
  }
}
