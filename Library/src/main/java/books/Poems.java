package books;
import java.util.ArrayList;
import java.util.Collections;

public class Poems {

    public static ArrayList<String> getPoetryBooks() {
        ArrayList<String> poetryBooks = new ArrayList<>();

        // Adds poetry books to array
        poetryBooks.add("Milk and Honey by Rupi Kaur");
        poetryBooks.add("The Sun and Her Flowers by Rupi Kaur");
        poetryBooks.add("Ariel by Sylvia Plath");
        poetryBooks.add("The Waste Land by T.S. Eliot");
        poetryBooks.add("Leaves of Grass by Walt Whitman");
        poetryBooks.add("The Complete Poems of Emily Dickinson by Emily Dickinson");
        poetryBooks.add("Selected Poems by Langston Hughes");
        poetryBooks.add("The Prophet by Kahlil Gibran");
        poetryBooks.add("The Essential Rumi by Jalal al-Din Rumi");
        poetryBooks.add("The Collected Poems of W.B. Yeats by W.B. Yeats");
        poetryBooks.add("The Collected Poems of Langston Hughes by Langston Hughes");
        poetryBooks.add("The Collected Poems of Wallace Stevens by Wallace Stevens");
        poetryBooks.add("The Collected Poems of Robert Frost by Robert Frost");
        poetryBooks.add("The Collected Poems of W.H. Auden by W.H. Auden");
        poetryBooks.add("The Collected Poems of T.S. Eliot by T.S. Eliot");
        poetryBooks.add("The Essential Haiku: Versions of Basho, Buson, & Issa by Robert Hass");
        poetryBooks.add("The Complete Poems by Anne Sexton");
        poetryBooks.add("Collected Poems by Sylvia Plath");
        poetryBooks.add("The Poetry of Pablo Neruda by Pablo Neruda");
        poetryBooks.add("The Complete Poetry and Prose by William Blake");
        poetryBooks.add("The Penguin Anthology of Twentieth-Century American Poetry by Rita Dove");
        poetryBooks.add("The Essential Neruda: Selected Poems by Pablo Neruda");
        poetryBooks.add("The Complete Poems of Anne Sexton by Anne Sexton");
        poetryBooks.add("The Poetry of Robert Frost by Robert Frost");
        poetryBooks.add("The Complete Poems of Samuel Taylor Coleridge by Samuel Taylor Coleridge");

        Collections.sort(poetryBooks);
        return poetryBooks;
    }
}
