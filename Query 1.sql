--  Mengambil Semua Film yang Tersedia Berdasarkan Bahasa (Language)
select
    f.title as film_title,
    l.name as language
from
    film as f
inner join
    language as l on f.language_id = l.language_id;
