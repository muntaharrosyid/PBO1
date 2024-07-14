package Anime;

public class Anime {   
    private int id;
    private String judul_anime;
    private int episode;
    private String studio;

    public void streaming(){
        System.out.println("Ini method untuk menonton secara daring");
    }
    public void download(){
        System.out.println("Ini method untuk mengunduh anime");
    }
    public void share(){
        System.out.println("Ini method untuk membagikan anime yang ditonton");
    }

    public int getId(){
        return this.id;
    }
    public String getJudulAnime(){
        return this.judul_anime;
    }
    public int getEpisode(){
        return this.episode;
    }
    public String getStudio(){
        return this.studio;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setJudulAnime(String judul_anime){
        this.judul_anime = judul_anime;
    }
    public void setEpisode(int episode){
        this.episode = episode;
    }
    public void setStudio(String studio){
        this.studio = studio;
    }
    
    public Anime(){
        System.out.println("Object telah disiapkan, constructor berjalan");
    }

}
