# Everything /v2/everything

Поиск среди миллионов статей из более чем 80 000 больших и малых источников новостей и блогов. Эта конечная точка подходит для обнаружения и анализа статей.

All articles about Bitcoin
Definition

```
GET https://newsapi.org/v2/everything?q=bitcoin&apiKey=dea68363ab664583904e15fa9b6346cb
```

Example response

```json
{
-   "status": "ok",
-   "totalResults": 8814,
-   -
    
    "articles": [
    -   -
        
        {
        -   -
            
            "source": {
            -   "id": "wired",
            -   "name": "Wired"},
        -   "author": "Arielle Pardes",
        -   "title": "Miami’s Bitcoin Conference Left a Trail of Harassment",
        -   "description": "For some women, inappropriate conduct from other conference-goers continued to haunt them online.",
        -   "url": ["https://www.wired.com/story/bitcoin-2022-conference-harassment/"](https://www.wired.com/story/bitcoin-2022-conference-harassment/),
        -   "urlToImage": ["https://media.wired.com/photos/627a89e3e37e715cb7d760d2/191:100/w_1280,c_limit/Bitcoin_Miami_Biz_GettyImages-1239817123.jpg"](https://media.wired.com/photos/627a89e3e37e715cb7d760d2/191:100/w_1280,c_limit/Bitcoin_Miami_Biz_GettyImages-1239817123.jpg),
        -   "publishedAt": "2022-05-10T16:59:46Z",
        -   "content": "Now, even though there are a number of women-focused crypto spaces, Odeniran says women are still underrepresented. Ive been in spaces where Im the only Black person, or the only woman, or the only B… [+3828 chars]"},
    -   -
        
        {
        -   -
            
            "source": {
            -   "id": "the-verge",
            -   "name": "The Verge"},
        -   "author": "Justine Calma",
        -   "title": "Why fossil fuel companies see green in Bitcoin mining projects",
        -   "description": "ExxonMobil and other fossil fuel companies have turned to Bitcoin mining to address a gas problem. But their plans come with risks.",
        -   "url": ["https://www.theverge.com/2022/5/4/23055761/exxonmobil-cryptomining-bitcoin-methane-gas"](https://www.theverge.com/2022/5/4/23055761/exxonmobil-cryptomining-bitcoin-methane-gas),
        -   "urlToImage": ["https://cdn.vox-cdn.com/thumbor/BZdljrBbt8tBl6oCCnckcDKqe6g=/0x90:4608x2503/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/23435975/1240300988.jpg"](https://cdn.vox-cdn.com/thumbor/BZdljrBbt8tBl6oCCnckcDKqe6g=/0x90:4608x2503/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/23435975/1240300988.jpg),
        -   "publishedAt": "2022-05-04T12:00:00Z",
        -   "content": "A Bitcoin mining site powered by otherwise lost gas from an oil well near Linden, Texas, on April 4th, 2022. | Photo by FRANCOIS PICARD/AFP via Getty Images\r\n\n \n\n Of all the corporate climate hype fl… [+6544 chars]"}
```
# Top headlines /v2/top-headlines
Эта конечная точка предоставляет актуальные и важные заголовки для страны, конкретной категории в стране, одного источника или нескольких источников. Вы также можете искать по ключевым словам. Статьи отсортированы по самой ранней дате публикации. Эта конечная точка отлично подходит для извлечения заголовков для использования с бегущей строкой новостей и т.п.

Top headlines in the US

Definition

```
GET https://newsapi.org/v2/top-headlines?country=us&apiKey=dea68363ab664583904e15fa9b6346cb
```

```json
{

-   "status": "ok",
-   "totalResults": 38,
-   -
    
    "articles": [
    -   -
        
        {
        -   -
            
            "source": {
            -   "id": "the-washington-post",
            -   "name": "The Washington Post"},
        -   "author": "Rachel Pannett, Felicia Sonmez, Amy Cheng, Andrew Jeong",
        -   "title": "Russia-Ukraine war news: Live updates - The Washington Post",
        -   "description": "The Senate is expected to follow suit this week, taking total U.S. support during the conflict in Ukraine to more than $50 billion.",
        -   "url": ["https://www.washingtonpost.com/world/2022/05/11/russia-ukraine-war-news-putin-live-updates/"](https://www.washingtonpost.com/world/2022/05/11/russia-ukraine-war-news-putin-live-updates/),
        -   "urlToImage": ["https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/K2AZRSWQSII6ZCDL353BQPJDH4.jpg&w=1440"](https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/K2AZRSWQSII6ZCDL353BQPJDH4.jpg&w=1440),
        -   "publishedAt": "2022-05-11T08:26:15Z",
        -   "content": "A top U.S. intelligence official on Tuesday warned of a prolonged and potentially escalatory conflict in Ukraine. Russian President Vladimir Putins objectives probably go beyond capturing the Donbas … [+1972 chars]"},
    -   -
        
        {
        -   -
            
            "source": {
            -   "id": "al-jazeera-english",
            -   "name": "Al Jazeera English"},
        -   "author": "Al Jazeera Staff",
        -   "title": "Shireen Abu Akleh: Al Jazeera journalist shot dead in West Bank - Al Jazeera English",
        -   "description": "Israeli forces shot Shireen Abu Akleh in the head while she was on assignment in Jenin in the occupied West Bank.",
        -   "url": ["https://www.aljazeera.com/news/2022/5/11/shireen-abu-akleh-israeli-forces-kill-al-jazeera-journalist"](https://www.aljazeera.com/news/2022/5/11/shireen-abu-akleh-israeli-forces-kill-al-jazeera-journalist),
        -   "urlToImage": ["https://www.aljazeera.com/wp-content/uploads/2022/05/17884512_10154964768850027_145705842645752519_n.jpeg?resize=1200%2C630"](https://www.aljazeera.com/wp-content/uploads/2022/05/17884512_10154964768850027_145705842645752519_n.jpeg?resize=1200%2C630),
        -   "publishedAt": "2022-05-11T08:02:57Z",
        -   "content": "Israeli forces have shot dead Al Jazeeras journalist Shireen Abu Akleh in the occupied West Bank, according to the Palestinian health ministry.\r\nShe was hit by a live bullet on Wednesday while coveri… [+5881 chars]"}
```
# Sources /v2/top-headlines/sources

Эта конечная точка возвращает подмножество издателей новостей, от которых доступны главные заголовки (/v2/top-headlines). В основном это удобная конечная точка, которую вы можете использовать для отслеживания издателей, доступных в API, и вы можете напрямую передавать ее своим пользователям.