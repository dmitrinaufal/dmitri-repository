-- Mengambil Data yang Menunjukkan Jumlah Film untuk Setiap Kategori (Category):
select
    c.name as category,
    count (f.film_id) AS jumlah_film
from
    film as f
inner join
    film_category AS fc ON f.film_id = fc.film_id
inner join
    category as c on fc.category_id = c.category_id
group by
    c.name
order by
    jumlah_film asc;
