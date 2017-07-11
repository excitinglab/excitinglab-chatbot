package com.excitinglab.kakaobot.model;

/**
 * Created by comchangs on 2017. 7. 1..
 */
public class Photo {
  private final String url;
  private final int width;
  private final int height;

  public Photo(String url, int width, int height) {
    this.url = url;
    this.width = width;
    this.height = height;
  }

  public String getUrl() {
    return url;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Photo{");
    sb.append("url='").append(url).append('\'');
    sb.append(", width=").append(width);
    sb.append(", height=").append(height);
    sb.append('}');
    return sb.toString();
  }
}
