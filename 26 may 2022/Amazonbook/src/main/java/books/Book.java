package books;

public class Book {
        private Long id ;
        private String name;
        private String AuthorName;
//    private LocalDateTime PublishDate;


        public Book(Long id, String name, String authorName) {
            this.id = id;
            this.name = name;
            AuthorName = authorName;
//        PublishDate = publishDate;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthorName() {
            return AuthorName;
        }

        public void setAuthorName(String authorName) {
            AuthorName = authorName;
        }

//    public LocalDateTime getPublishDate() {
//        return PublishDate;
//    }
//
//    public void setPublishDate(LocalDateTime publishDate) {
//        PublishDate = publishDate;
//    }


        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", AuthorName='" + AuthorName + '\'' +
                    '}';
        }
    }
