package books;
import java.util.ArrayList;
import java.util.Collections;

public class HistoryBooks {

    public static ArrayList<String> getHistoryBooks() {
        ArrayList<String> historyBooks = new ArrayList<>();

        // Add history books to the ArrayList
        historyBooks.add("A People's History of the United States by Howard Zinn");
        historyBooks.add("The Guns of August by Barbara W. Tuchman");
        historyBooks.add("SPQR: A History of Ancient Rome by Mary Beard");
        historyBooks.add("The Rise and Fall of the Third Reich by William L. Shirer");
        historyBooks.add("The Warmth of Other Suns: The Epic Story of America's Great Migration by Isabel Wilkerson");
        historyBooks.add("Genghis Khan and the Making of the Modern World by Jack Weatherford");
        historyBooks.add("Sapiens: A Brief History of Humankind by Yuval Noah Harari");
        historyBooks.add("The Wright Brothers by David McCullough");
        historyBooks.add("The History of the Ancient World: From the Earliest Accounts to the Fall of Rome by Susan Wise Bauer");
        historyBooks.add("The Silk Roads: A New History of the World by Peter Frankopan");
        historyBooks.add("1491: New Revelations of the Americas Before Columbus by Charles C. Mann");
        historyBooks.add("The Swerve: How the World Became Modern by Stephen Greenblatt");
        historyBooks.add("The Plantagenets: The Warrior Kings and Queens Who Made England by Dan Jones");
        historyBooks.add("The Age of Capital: 1848-1875 by Eric Hobsbawm");
        historyBooks.add("Stalingrad: The Fateful Siege: 1942-1943 by Antony Beevor");
        historyBooks.add("The Ottoman Empire and Early Modern Europe by Daniel Goffman");
        historyBooks.add("The Path Between the Seas: The Creation of the Panama Canal, 1870-1914 by David McCullough");
        historyBooks.add("Salt: A World History by Mark Kurlansky");
        historyBooks.add("A History of the World in 6 Glasses by Tom Standage");
        historyBooks.add("1493: Uncovering the New World Columbus Created by Charles C. Mann");
        historyBooks.add("The First Tycoon: The Epic Life of Cornelius Vanderbilt by T.J. Stiles");
        historyBooks.add("Empire of Cotton: A Global History by Sven Beckert");
        historyBooks.add("The Emperor of All Maladies: A Biography of Cancer by Siddhartha Mukherjee");
        historyBooks.add("The Making of the Atomic Bomb by Richard Rhodes");
        historyBooks.add("The Warmth of Other Suns: The Epic Story of America's Great Migration by Isabel Wilkerson");

        Collections.sort(historyBooks);
        return historyBooks;
    }
}
