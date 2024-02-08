package books;
import java.util.ArrayList;
import java.util.Collections;

public class CookBooks {

    public static ArrayList<String> getCookBooks() {
        ArrayList<String> cookBooks = new ArrayList<>();

        // Add cookbooks to the ArrayList
        cookBooks.add("The Joy of Cooking by Irma S. Rombauer");
        cookBooks.add("Salt, Fat, Acid, Heat: Mastering the Elements of Good Cooking by Samin Nosrat");
        cookBooks.add("How to Cook Everything: Simple Recipes for Great Food by Mark Bittman");
        cookBooks.add("The Food Lab: Better Home Cooking Through Science by J. Kenji López-Alt");
        cookBooks.add("Mastering the Art of French Cooking by Julia Child");
        cookBooks.add("Essentials of Classic Italian Cooking by Marcella Hazan");
        cookBooks.add("Plenty: Vibrant Vegetable Recipes from London's Ottolenghi by Yotam Ottolenghi");
        cookBooks.add("The Complete Cooking for Two Cookbook: 650 Recipes for Everything You'll Ever Want to Make by America's Test Kitchen");
        cookBooks.add("Thug Kitchen: Eat Like You Give a F*ck by Thug Kitchen");
        cookBooks.add("The Barefoot Contessa Cookbook by Ina Garten");
        cookBooks.add("Vegetable Kingdom: The Abundant World of Vegan Recipes by Bryant Terry");
        cookBooks.add("The Whole30: The 30-Day Guide to Total Health and Food Freedom by Melissa Hartwig Urban");
        cookBooks.add("Milk Bar Life: Recipes & Stories by Christina Tosi");
        cookBooks.add("Veganomicon: The Ultimate Vegan Cookbook by Isa Chandra Moskowitz");
        cookBooks.add("The Silver Spoon by Phaidon Press");
        cookBooks.add("The Flavor Bible: The Essential Guide to Culinary Creativity, Based on the Wisdom of America's Most Imaginative Chefs by Karen Page and Andrew Dornenburg");
        cookBooks.add("Cravings: Recipes for All the Food You Want to Eat by Chrissy Teigen");
        cookBooks.add("The Complete Mediterranean Cookbook: 500 Vibrant, Kitchen-Tested Recipes for Living and Eating Well Every Day by America's Test Kitchen");
        cookBooks.add("Six Seasons: A New Way with Vegetables by Joshua McFadden");
        cookBooks.add("Jamie Oliver's Food Revolution: Rediscover How to Cook Simple, Delicious, Affordable Meals by Jamie Oliver");
        cookBooks.add("How to Grill: The Complete Illustrated Book of Barbecue Techniques by Steven Raichlen");
        cookBooks.add("The Smitten Kitchen Cookbook by Deb Perelman");
        cookBooks.add("Nopalito: A Mexican Kitchen by Gonzalo Guzmán");
        cookBooks.add("The Pioneer Woman Cooks: Dinnertime - Comfort Classics, Freezer Food, 16-Minute Meals, and Other Delicious Ways to Solve Supper! by Ree Drummond");
        cookBooks.add("The Professional Chef by The Culinary Institute of America");

        Collections.sort(cookBooks);
        return cookBooks;
    }
}
