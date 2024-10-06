package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorUtilities {
    public static void getColor(WebElement el){
        String hexcode=Color.fromString(el.getCssValue("background-color")).asHex();

        Map<String,String> colorMap=new HashMap<>();
        colorMap.put("Black", "#000000");
        colorMap.put("White", "#FFFFFF");
        colorMap.put("Red", "#FF0000");
        colorMap.put("Green", "#008000");
        colorMap.put("Blue", "#0000FF");
        colorMap.put("Yellow", "#FFFF00");
        colorMap.put("Cyan", "#00FFFF");
        colorMap.put("Magenta", "#FF00FF");
        colorMap.put("Gray", "#808080");
        colorMap.put("Maroon", "#800000");
        colorMap.put("Olive", "#808000");
        colorMap.put("Purple", "#800080");
        colorMap.put("Teal", "#008080");
        colorMap.put("Navy", "#000080");
        colorMap.put("Silver", "#C0C0C0");
        colorMap.put("Lime", "#00FF00");
        colorMap.put("Aqua", "#00FFFF");
        colorMap.put("Fuchsia", "#FF00FF");
        colorMap.put("DarkRed", "#8B0000");
        colorMap.put("DarkGreen", "#006400");
        colorMap.put("DarkBlue", "#00008B");
        colorMap.put("DarkCyan", "#008B8B");
        colorMap.put("DarkMagenta", "#8B008B");
        colorMap.put("DarkGray", "#A9A9A9");
        colorMap.put("DarkOliveGreen", "#556B2F");
        colorMap.put("DarkOrange", "#FF8C00");
        colorMap.put("DarkOrchid", "#9932CC");
        colorMap.put("DarkSlateBlue", "#483D8B");
        colorMap.put("DarkSlateGray", "#2F4F4F");
        colorMap.put("DarkTurquoise", "#00CED1");
        colorMap.put("DarkViolet", "#9400D3");
        colorMap.put("DeepPink", "#FF1493");
        colorMap.put("DeepSkyBlue", "#00BFFF");
        colorMap.put("DodgerBlue", "#1E90FF");
        colorMap.put("FireBrick", "#B22222");
        colorMap.put("FloralWhite", "#FFFAF0");
        colorMap.put("ForestGreen", "#228B22");
        colorMap.put("Gainsboro", "#DCDCDC");
        colorMap.put("GhostWhite", "#F8F8FF");
        colorMap.put("Gold", "#FFD700");
        colorMap.put("GoldenRod", "#DAA520");
        colorMap.put("HoneyDew", "#F0FFF0");
        colorMap.put("IndianRed", "#CD5C5C");
        colorMap.put("Indigo", "#4B0082");
        colorMap.put("Ivory", "#FFFFF0");
        colorMap.put("Khaki", "#F0E68C");
        colorMap.put("Lavender", "#E6E6FA");
        colorMap.put("LavenderBlush", "#FFF0F5");
        colorMap.put("LawnGreen", "#7CFC00");
        colorMap.put("LightBlue", "#ADD8E6");
        colorMap.put("LightCoral", "#F08080");
        colorMap.put("LightCyan", "#E0FFFF");
        colorMap.put("LightGoldenRodYellow", "#FAFAD2");
        colorMap.put("LightGray", "#D3D3D3");
        colorMap.put("LightGreen", "#90EE90");
        colorMap.put("LightPink", "#FFB6C1");
        colorMap.put("LightSalmon", "#FFA07A");
        colorMap.put("LightSeaGreen", "#20B2AA");
        colorMap.put("LightSkyBlue", "#87CEFA");
        colorMap.put("LightSlateGray", "#778899");
        colorMap.put("LightSteelBlue", "#B0C4DE");
        colorMap.put("LightYellow", "#FFFFE0");
        colorMap.put("LimeGreen", "#32CD32");
        colorMap.put("MediumAquaMarine", "#66CDAA");
        colorMap.put("MediumBlue", "#0000CD");
        colorMap.put("MediumOrchid", "#BA55D3");
        colorMap.put("MediumPurple", "#8a4d76");
        colorMap.put("MediumSeaGreen", "#3CB371");
        colorMap.put("MediumSlateBlue", "#7B68EE");
        colorMap.put("MediumSpringGreen", "#00FA9A");
        colorMap.put("MediumTurquoise", "#48D1CC");
        colorMap.put("MediumVioletRed", "#C71585");
        colorMap.put("MidnightBlue", "#191970");
        colorMap.put("MintCream", "#F5FFFA");
        colorMap.put("MistyRose", "#FFE4E1");
        colorMap.put("Moccasin", "#FFE4B5");
        colorMap.put("NavajoWhite", "#FFDEAD");
        colorMap.put("OldLace", "#FDF5E6");
        colorMap.put("OliveDrab", "#6B8E23");
        colorMap.put("Orange", "#FFA500");
        colorMap.put("OrangeRed", "#FF4500");
        colorMap.put("Orchid", "#DA70D6");
        colorMap.put("PaleGoldenRod", "#EEE8AA");
        colorMap.put("PaleGreen", "#98FB98");
        colorMap.put("PaleTurquoise", "#AFEEEE");
        colorMap.put("PaleVioletRed", "#DB7093");
        colorMap.put("PapayaWhip", "#FFEFD5");
        colorMap.put("PeachPuff", "#FFDAB9");
        colorMap.put("Peru", "#CD853F");
        colorMap.put("Pink", "#FFC0CB");
        colorMap.put("Plum", "#DDA0DD");
        for(Map.Entry<String,String> color:colorMap.entrySet()){
            if(color.getValue().equalsIgnoreCase(hexcode)){
                System.out.println("the color of the element is: "+color.getKey());
            }
        }

    }
}
