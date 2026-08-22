import { execSync } from 'node:child_process';

const run = (cmd) => execSync(cmd, { stdio: 'inherit', shell: true });
run('npm install');
run('npx cap add android');
run('npx cap add ios');
run('npx cap sync');
console.log('\nGym Tracker: Android and iOS platforms created and synchronized.');
