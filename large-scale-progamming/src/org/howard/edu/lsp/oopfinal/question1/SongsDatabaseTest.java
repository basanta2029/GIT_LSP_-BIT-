package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        // Check if songs are correctly added to the database
        assertEquals(Set.of("Savage", "Gin and Juice"), db.getSongs("Rap"));
        assertEquals(Set.of("Sweet Alabama"), db.getSongs("Country"));
        assertEquals(Set.of("Always There"), db.getSongs("Jazz"));

        // Adding a new song to an existing genre
        db.addSong("Rap", "New Rap Song");
        assertTrue(db.getSongs("Rap").contains("New Rap Song"));

        // Adding a new song to a new genre
        db.addSong("Blues", "New Blues Song");
        assertTrue(db.getSongs("Blues").contains("New Blues Song"));
    }

    @Test
    public void testGetGenreOfSong() {
        // Check if the correct genre is returned for a given song
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Rap", db.getGenreOfSong("Gin and Juice"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Nonexistent Song")); // Ensuring no genre is found for a non-existent song
    }

    @Test
    public void testGetSongs() {
        // Check if the correct set of songs is returned for each genre
        assertEquals(Set.of("Savage", "Gin and Juice"), db.getSongs("Rap"));
        assertEquals(Set.of("Sweet Alabama"), db.getSongs("Country"));
        assertEquals(Set.of("Always There"), db.getSongs("Jazz"));
        assertTrue(db.getSongs("Nonexistent Genre").isEmpty()); // Checking for an empty set for a non-existent genre
    }
}
