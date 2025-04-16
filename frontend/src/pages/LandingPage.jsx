import { Box, Button, Container, Typography, AppBar, Toolbar, useTheme, useMediaQuery } from '@mui/material';
import styles from './LandingPage.module.css';

const LandingPage = () => {
  const theme = useTheme();
  const isSmall = useMediaQuery(theme.breakpoints.down('sm'));

  return (
    <Box className={styles.root}>
      <AppBar position="static" color="transparent" elevation={0} className={styles.appbar}>
        <Toolbar className={styles.toolbar}>
          <Typography variant="h6" className={styles.logo}>SyntaxLlama</Typography>
          <Box className={styles.navLinks}>
            <Typography variant="body1">Home</Typography>
            <Typography variant="body1">Features</Typography>
            <Typography variant="body1">About</Typography>
            <Button variant="outlined" className={styles.loginButton}>Log in</Button>
          </Box>
        </Toolbar>
      </AppBar>

      <Container maxWidth="xl" className={styles.heroContainer}>
        <Box className={styles.heroContent}>
          <Box className={styles.heroText}>
            <Typography variant={isSmall ? 'h4' : 'h3'} className={styles.headline}>
              Ace your learning with flashcards
            </Typography>
            <Typography variant="body1" className={styles.subtitle}>
              Master any subject with easy-to-use digital flashcards.
            </Typography>
            <Button variant="contained" className={styles.cta}>Get Started</Button>
          </Box>
          <Box className={styles.heroImage}>
            <Box className={styles.flashcardStack}>
              <Box className={`${styles.flashcard} ${styles.backCard}`}></Box>
              <Box className={`${styles.flashcard} ${styles.middleCard}`}></Box>
              <Box className={`${styles.flashcard} ${styles.topCard}`}>
                <Box className={styles.flashcardHeader}></Box>
                <Typography className={styles.flashcardTitle}>Function</Typography>
                <Box className={styles.flashcardLineShort}></Box>
                <Box className={styles.flashcardLine}></Box>
              </Box>
            </Box>
          </Box>
        </Box>
      </Container>
    </Box>
  );
};

export default LandingPage;