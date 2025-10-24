📖 Project Overview
Coupling is my first Java project — a mobile app designed to help couples feel more appreciated by remembering each
other's interests, dislikes, favorites, and important dates. The app acts like a personal relationship cheatsheet,
helping partners avoid unintentionally forgetting meaningful details.
For now, Coupling is a private app just for couples — no ads, no public profiles, and no social feed. In the future, it
may evolve into a couples-focused social platform with features like event listings, product recommendations, and
historical couple data.
The project currently contains the simple outline of how my idea is going to work.

How It Works

- Each user logs in with a unique ID and is linked to their partner
- Every user has a personal profile with:
- Profile picture
- Partner link
- Couple pictures (optional)
- Interests, dislikes, favorites
- Important dates (e.g. anniversaries, birthdays)
- Emoji to show current mood
- Short status
- Location (shared only with partner as "home" or "work")

  🔐 Privacy Design
- Public by default: profile picture, ID, and partner link
- Optional privacy: couple pictures, interests, dislikes, favorites, dates, emoji, and status
- Location is never public — only shared with partner and limited to "home" or "work" labels (no exact coordinates)

  📝 Required Info
- Legal name (optional to show)
- Email (used as primary key)
- Birthday (optional to show)
- ID (visible in profile)
- Partner's ID (clickable to view partner profile)
- Interests: food, movies, hobbies, restaurants, countries, gifts
- Dislikes: food, movies, music, hobbies, turn-offs, pet peeves
- Favorites: food, movies, music, events, restaurants, gifts
- Important dates: anniversary, birthday, custom dates
    - Emoji: basic face icons only (no text)
- All content must respect copyright — no copyrighted images, music, or media.

  🧪 Minimum Viable Product (MVP)
- ✅ User registration with email, name, birthday, and partner ID
- ✅ Profile with interests, dislikes, favorites, dates, emoji, and status
- ✅ Privacy flags for each field (public/private)
- ✅ Location sharing (home/work only) with partner
- ✅ Frontend built with Expo for mobile app integration
  :https://github.com/haemin47727/coupling

## 🗃️ Database Setup

To recreate the MySQL database:

1. Open MySQL Workbench or your preferred client
2. Create a new database (e.g., `coupling_db`)
3. Import the file from `/database/coupling.sql`

```sql
SOURCE /path/to/coupling.sql;

